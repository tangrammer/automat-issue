(ns issue.core
  (:gen-class))


(defn -main [& args]
  ;; We eval so that we don't AOT anything beyond this class
  (eval '(do
           (require '[automat.core :as a])
           (println "welcome -main! =>" [(a/or :a)]))))
