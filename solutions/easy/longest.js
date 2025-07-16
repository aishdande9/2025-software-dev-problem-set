let str = "I am learning fullstack development";


// let word = str.split(" ").reduce((longest,current)=>current.length>0 ? current :longest," ")
// console.log(word);
let longest = "";
let word = str.split(" ");

for(let i=0;i<word.length;i++){
    if(word[i].length>longest.length){
        longest = word[i];
    }

    
}


console.log(longest);
