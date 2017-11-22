function addOrRemove(arr) {
    let newArr = [];
    for (let i = 0; i < arr.length; i++) {
        let temp = arr[i].split(' ');
        let command = temp[0];
        let num = temp[1];
        if (command == "add") {
            newArr.push(num)
        }
        if (command == "remove") {
            newArr.splice(num, 1)
        }
    }
    for (j = 0; j < newArr.length; j++) {
        console.log(newArr[j])
    }
}
addOrRemove(['add 3','add 5','remove 1','add 2'])