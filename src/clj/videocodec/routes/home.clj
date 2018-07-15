(ns videocodec.routes.home
  (:require [videocodec.layout :as layout]
            [videocodec.db.core :as db]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]
            [ring.util.codec :as ring-codec]))

(defn home-page []
  (layout/render
    "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page []
  (layout/render "about.html"))

(defn render-category [category_link] (layout/render "category.html" {:category (db/category-by-link {:link category_link}) :cat-link category_link}))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/:category_link" [category_link] (render-category category_link)))


;(db/article-by-title {:title "Divx видео кодек"})
(db/category-by-link {:link "стандарты кодирования видео"})
;(mount.core/start #'videocodec.config/env #'videocodec.db.core/*db*)