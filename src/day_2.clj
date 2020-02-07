(ns src.day_2)

(def intcode-input [1,
                    0,
                    0,
                    3,
                    1,
                    1,
                    2,
                    3,
                    1,
                    3,
                    4,
                    3,
                    1,
                    5,
                    0,
                    3,
                    2,
                    9,
                    1,
                    19,
                    1,
                    9,
                    19,
                    23,
                    1,
                    23,
                    5,
                    27,
                    2,
                    27,
                    10,
                    31,
                    1,
                    6,
                    31,
                    35,
                    1,
                    6,
                    35,
                    39,
                    2,
                    9,
                    39,
                    43,
                    1,
                    6,
                    43,
                    47,
                    1,
                    47,
                    5,
                    51,
                    1,
                    51,
                    13,
                    55,
                    1,
                    55,
                    13,
                    59,
                    1,
                    59,
                    5,
                    63,
                    2,
                    63,
                    6,
                    67,
                    1,
                    5,
                    67,
                    71,
                    1,
                    71,
                    13,
                    75,
                    1,
                    10,
                    75,
                    79,
                    2,
                    79,
                    6,
                    83,
                    2,
                    9,
                    83,
                    87,
                    1,
                    5,
                    87,
                    91,
                    1,
                    91,
                    5,
                    95,
                    2,
                    9,
                    95,
                    99,
                    1,
                    6,
                    99,
                    103,
                    1,
                    9,
                    103,
                    107,
                    2,
                    9,
                    107,
                    111,
                    1,
                    111,
                    6,
                    115,
                    2,
                    9,
                    115,
                    119,
                    1,
                    119,
                    6,
                    123,
                    1,
                    123,
                    9,
                    127,
                    2,
                    127,
                    13,
                    131,
                    1,
                    131,
                    9,
                    135,
                    1,
                    10,
                    135,
                    139,
                    2,
                    139,
                    10,
                    143,
                    1,
                    143,
                    5,
                    147,
                    2,
                    147,
                    6,
                    151,
                    1,
                    151,
                    5,
                    155,
                    1,
                    2,
                    155,
                    159,
                    1,
                    6,
                    159,
                    0,
                    99,
                    2,
                    0,
                    14,
                    0])

(def test-opcode [1 3 1 3])

(defn get-opcode [input acc]
"Given input program state and location, gets the 4-tuple opcode instruction as a vector"
  (subvec input acc (+ acc 4)))

(defn get-args [input opcode]
  "Given input program state and opcode, take the pointers located at 1 and 2, and return referenced values as vec."
  (for [arg-index (subvec opcode 1 3)
        :let [arg-val (nth arg-index input)]]
    (nth  arg-index)))

(get-args test-opcode test-opcode)

(defn assoc-results [input opcode-result opcode]
  "Given result of performing opcode, return new program state by assoc-ing result at position indicated by final
  instruction"
  (assoc input (last opcode) opcode-result))

(defn cpu [input acc]
  "Calculates result of an opcode instruction."
   (cond
     (= 1 (get-opcode input acc) (map + (get-args input (get-opcode input acc))))
     (= 2 (get-opcode input acc) (map * (get-args input (get-opcode input acc))))
     (= 99 (get-opcode input acc) input)
     (str "Invalid opcode at index " acc ". Execution halted.")))

(defn int-code-computer [input]
  (let []
    (vec) (take 4 )))