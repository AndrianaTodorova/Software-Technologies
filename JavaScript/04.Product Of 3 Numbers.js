function positiveOrNegative(arr) {
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1]);
    let num3 = Number(arr[2]);

    if ( num3 >= 0) {
        return "Positive";
    }
    else {
        return "Negative";
    }
}

console.log(positiveOrNegative(2, 2, 2))