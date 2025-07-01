/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const freq = {};

    for (let i = 0; i < nums.length; i++) {
        const num = nums[i];
        if (freq[num]) {
            freq[num] += 1;
        } else {
            freq[num] = 1;
        }
    }

    const sorted = Object.entries(freq).sort((a, b) => b[1] - a[1]);

    const result = [];
    for (let i = 0; i < k; i++) {
        result.push(Number(sorted[i][0]));
    }

    return result;
};