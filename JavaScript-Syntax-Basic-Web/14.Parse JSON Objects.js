function parsedObjects(arr) {
    for (let i = 0; i < arr.length; i++) {
        let line = JSON.parse(arr[i]);

        console.log(`Name: ${line.name}`);
        console.log(`Age: ${line.age}`);
        console.log(`Date: ${line.date}`);
    }
}

parsedObjects(['{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}']);