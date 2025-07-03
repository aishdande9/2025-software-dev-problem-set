/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {

    let res = new Array(nums.length);


    for(let i=0;i<nums.length;i++){
        let prod = 1;
        for(let j=0;j<nums.length;j++){
            if(i !== j){
                prod *= nums[j]
            }
        }
         res[i] = prod
    }
    return res;
    
};