function turnObjectIntoJSONStr(arr) {
    let obj = {};

    for (let json = 0;json < arr.length;json++) {
        let splitedInput = arr[json].split('->').map(x => x.trim());
        if(json == 0){
            obj["name"] = splitedInput[1];
        }
        else if(json == 1){
            obj["surname"] = splitedInput[1];
        }
        else if(json == 2) {
            obj["age"] = Number(splitedInput[1]);
        }
        else if(json == 3) {
            obj["grade"] = Number(splitedInput[1]);
        }
        else if(json == 4){
            obj["date"] = splitedInput[1];
        }
        else if(json == 5){
            obj["town"] = splitedInput[1];
        }



    }
    console.log(JSON.stringify(obj))

}
turnObjectIntoJSONStr([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);