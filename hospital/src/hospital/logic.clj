(ns hospital.logic)

; Test Driven Development
; Test Driven Design

(defn cabe-na-fila?
  [hospital departamento]
  ;(count (get hospital departamento))
  (-> hospital
      departamento
      count
      (< 5)))