(defproject issue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :exclusions [org.clojure/clojure]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [automat "0.2.2"]]
  :main issue.core
  :aot :all)
