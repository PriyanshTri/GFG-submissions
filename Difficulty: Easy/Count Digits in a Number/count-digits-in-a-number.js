/**
 * @param {number} n
 * @returns {number}
 */
class Solution {
    countDigits(n) {
        let count =0;
        while(n>0){
            count +=1;
            n/=10;
            n=Math.floor(n);
        }
        return count
    }
}