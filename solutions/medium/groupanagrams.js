/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let freq = {};
    for(let s of strs){
        const sortedS = s.split("").sort().join("");

        if(!freq[sortedS]){
            freq[sortedS] = [];
        }
            freq[sortedS].push(s)
        }
    
    return Object.values(freq)
};