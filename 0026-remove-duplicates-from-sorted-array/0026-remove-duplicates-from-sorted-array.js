/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    const numsLength = nums.length;
    
    let index = 0
    for (let j = 1; j < numsLength; j++) {
        if(nums[j] !== nums[index]) {
            index++;
            nums[index] = nums[j];
        }
    }
    return index + 1;
};


