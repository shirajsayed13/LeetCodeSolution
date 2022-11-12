/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i <= nums.length; i++) {
        for (let j = i+1; j <= nums.length - 1; j++) {
            let sum = nums[i] + nums[j];
            if(target == sum) {
                return [i, j];
            }
        }
    }
};


