(defproject clojure-cafes "0.1.0-SNAPSHOT"
  :description "Cafe recommendations app"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [clj-http "3.12.3"]
                 [cheshire "5.11.0"]
                 [ring/ring-defaults "0.3.4"]
                 [hiccup "1.0.5"]
                 [seancorfield/next.jdbc "1.2.827"]
                 [compojure "1.7.0"]
                 [ring/ring-devel "1.10.0"]
                 [ring/ring-core "1.10.0"]
                 [ring/ring-jetty-adapter "1.10.0"]]
  :main ^:skip-aot clojurecafes.web
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
