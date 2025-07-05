/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    let res = 0;
    const store = new Set(nums);
  
    for(let i of nums){
          let curr = i;
          let streak = 0;
while(store.has(curr)){
    streak++;
    curr++;
}
     res = Math.max(res,streak)    

    }

   return res;
};