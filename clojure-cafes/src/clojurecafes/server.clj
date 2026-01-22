(ns clojurecafes.server
    (:gen-class)
    (:require [ring.adapter.jetty :refer [run-jetty]]
      [ring.middleware.params :refer [wrap-params]]
      [clojurecafes.routes :as routes]))

(def app
  (wrap-params routes/app-routes)
  )

(defn -main []
      (println "Server pokrenut na http://localhost:3000")
      (run-jetty app {:port 3000 :join? false}))

