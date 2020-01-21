/**
 * 
https://leetcode.com/submissions/detail/296175828/
 */


/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    
    return  address.replace(/\./g, '[.]');
  
      
  };