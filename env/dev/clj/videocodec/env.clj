(ns videocodec.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [videocodec.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[videocodec started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[videocodec has shut down successfully]=-"))
   :middleware wrap-dev})
