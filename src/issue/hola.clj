(println "hola...")
(ns issue.hola
  (:require [automat.fsm :as f]
            [automat.core :as a]))

(defn hi []
  [(a/or :b)])
