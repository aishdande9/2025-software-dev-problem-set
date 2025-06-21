/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.replace(/[ ,:]/g, "").toLowerCase();
  let rev = s.replace(/[ ,:]/g, "").toLowerCase().split("").reverse().join("");
  if(rev === s){
      return true;
  }
  return false;
  
  };