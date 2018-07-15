(ns videocodec.config
  (:require [cprop.core :refer [load-config]]
            [cprop.source :as source]
            [mount.core :refer [args defstate]]))

(defstate env
  :start
  (load-config
    :merge
    [(args)
     (source/from-system-props)
     (source/from-env)])
  :database-url "jdbc:mysql://localhost/videocodec?user=root&password=tip1mysql")
