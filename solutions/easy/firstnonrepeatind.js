
// Given a string s, find the first non-repeating character and return its index. If it doesn't exist, return -1.

function nonRepeatingCharacter(str){

    freq = {};
for(let i =0;i<str.length;i++){
if(freq[str[i]]){
    freq[str[i]] += 1;
}else{
    freq[str[i]] = 1;
}
}

for(let i=0;i<str.length;i++){
    if(freq[str[i]] === 1){
        return i;
    }

}


return -1;
}


let str = "loveleetcode";
console.log(nonRepeatingCharacter(str));
