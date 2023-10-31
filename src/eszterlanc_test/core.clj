(ns eszterlanc-test.core
  (:require [eszterlanc.core :as c]))

(c/object->clj
  (c/sentence-array "Kezdetben Isten teremtette baglyokat"))
