/**
 * 
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 * 
 * @param {string[]} words
 * @param {string} order
 * @return {boolean}
 */
var isAlienSorted = function(words, order) {
    return [...words]
        .sort((a, b) => {
            for (let i = 0; i < a.length; i++) {
                if (a[i] === b[i]) continue;
                if (order.indexOf(a[i]) > order.indexOf(b[i])) return 1;
                if (order.indexOf(a[i]) < order.indexOf(b[i])) return -1;
            }
            return a.length - b.length;
        }).join('') === words.join('');
};