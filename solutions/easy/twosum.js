/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let indices = []
    for(let i=0;i<nums.length;i++){
        if(nums[i]+nums[i+1]=== target){
            indices.push(i,i+1)
        }
    }
    return indices;
};