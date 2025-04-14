function sort(input) {
    for (i = 0; i < input.length; i++) {
        let isSorted = true

        for (k = 0; k < input.length - 1; k++) {
            if (input[k] > input[k + 1]) {
                [input[k], input[k + 1]] = [input[k + 1], input[k]]
                isSorted = false
            }
        }

        if (isSorted) {
            break
        }
    }

    return input
}

const result = sort([1,2,3,4,5])
console.log(result)