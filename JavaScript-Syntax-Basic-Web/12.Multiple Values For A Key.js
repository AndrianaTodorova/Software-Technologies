function addValues(arr) {
    let arrResult = [];
    let keyToFind = arr[arr.length - 1];
    let key;
    let value;
    for (let i = 0; i < arr.length - 1; i++) {
        let pair = arr[i].split(' ');
        key = pair[0];
        value = pair[1];
        arrResult[key] = value;


        if(keyToFind == key){
            console.log(arrResult[key])
        }
    }
    if(arrResult[keyToFind] == undefined){
          console.log("None");
    }


}

addValues(['key value', 'key eulav', 'test test', '3 test', '3 test1','key']);