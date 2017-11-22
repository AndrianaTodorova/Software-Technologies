function setIndex(text){
    let count=Number(text[0]);
    let newArray=[];
    for(let i=1;i<text.length;i++){
        let temp=text[i].split(' - ');
        let index=temp[0];
        let value=temp[1];
        newArray[index]=value;
    }
    for(let j=0;j<count;j++){
        if(newArray[j]==undefined){
            console.log(0);
        }
        else{
            console.log(newArray[j]);
        }
    }
}
console.log(setIndex(5,['0 - 1', '1 - 2']))
