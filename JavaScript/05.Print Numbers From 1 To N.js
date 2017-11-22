function printNumberToN([num]) {
    num = Number(num);
    for(let i = 1; i <= num; i++){
        console.log(i);
    }
}
console.log(printNumberToN(6));