(ns clojurecafes.routes
  (:require [clojurecafes.core :as core]
            [clojurecafes.web :as web]
            [compojure.core :refer [GET POST defroutes]]
            [compojure.route :as route]
            [ring.util.response :refer [file-response]]))

(defroutes app-routes
  (GET "/" []
    (file-response "resources/public/index.html"))

  (POST "/search" {params :params}
    (let [user {:lat 44.8186
                :lng 20.46
                :service (keyword (params "service"))
                :coffee (keyword (params "coffee"))
                :milk (keyword (params "milk"))
                :ambience (keyword (params "ambience"))
                :smoke (case (params "smoke")
                         "smoke"    :smoke
                         "no-smoke" :no-smoke)
                :pet (keyword (params "pet"))
                :location (params "location")}
          cafes (core/filter-cafes user)]
      (web/results-page cafes)))

  (route/resources "/")
  (route/not-found "404"))
