function storedObjects(arr) {
    let students = [];
    for (obj of arr) {
        let student = obj.split('->').map(x => x.trim());
        students.push({
            name: student[0],
            age: Number(student[1]),
            grade: Number(student[2])
        });

    }
    for (student of students) {
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade.toFixed(2)}`);
    }
}
storedObjects([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
]);