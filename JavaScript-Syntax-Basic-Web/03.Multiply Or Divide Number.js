function multiplyOrDivide(arr) {
    let num1 = Number(arr[0]);
     let num2 = Number(arr[1]);
    if (num1 <= num2){
        return num1 * num2;

    }
    else{
        return num1 / num2;
    }
}
console.log(multiplyOrDivide(6,7))