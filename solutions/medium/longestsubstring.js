/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let max = 0;
       for(let i=0;i<s.length;i++){
      let res = new Set();
           for(let j=i;j<s.length;j++){
   if(!res.has(s[j])){
       res.add(s[j]);
       max = Math.max(max,j-i+1);
   
   }else{break;}
   
           }
       }
       return max;
   };