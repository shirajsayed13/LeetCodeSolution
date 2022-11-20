/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    
    let result = 0;
    
    for (let i = s.length - 1; i >= 0; i--) {
        if (s[i] !== ' ') {
           result++; 
        } else if (result !== 0) {
            return result;
        }
    }
    
    return result;
    
};
