#!/usr/bin/env bb
(ns day01
  (:require [clojure.string :as str]))

(def input (->> "day01/input" slurp str/split-lines (map read-string)))

(defn count-second-bigger [col]
  (count
   (filter #(< (first %) (second %))
           (partition 2 1 col))))

(def solution-silver
  (count-second-bigger input))

(def solution-gold
  (count-second-bigger
   (map #(+ (first %) (second %) (nth % 2))
        (partition 3 1 input))))

(println solution-silver)
(println solution-gold)
