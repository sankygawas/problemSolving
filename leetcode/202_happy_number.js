/**
 * 
 * https://leetcode.com/problems/happy-number/
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    let res = []
    while (1) {
        let tmp = 0 
        n.toString().split('').forEach(val => {
            tmp += Number(val) ** 2
        })
        if (tmp == 1)
            return true
        if (res.includes(tmp))
            return false
        res.push(tmp)
        n = tmp
    }
};