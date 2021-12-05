#!/usr/bin/env bb
(ns day01
  (:require [clojure.string :as str]))

(def input (->> "day01/input" slurp str/split-lines (map read-string)))

(def solution-silver
  (count
   (filter #(< (first %) (second %))
           (partition 2 1 input))))

