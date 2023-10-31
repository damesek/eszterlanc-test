(ns eszterlanc-test.core
  (:require [eszterlanc.core :as c]
            [eszterlanc.gui :as GUI]))


(defn init
  "that was easier than I planned.."
  []
  (GUI/init))

(comment

  (init)

  (c/object->clj
    (c/sentence-array "Kezdetben Isten teremtette baglyokat"))

  )