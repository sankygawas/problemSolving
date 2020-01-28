/**
 * 
 * 
 * https://leetcode.com/problems/reorder-data-in-log-files/submissions/
 * 
 * @param {string[]} logs
 * @return {string[]}
 */
const reorderLogFiles = (logs) => {
    const body = s => s.slice(s.indexOf(' ') + 1); // get the body after identifier
    const isNum = c => /\d/.test(c);
  
    // if body same then compare identifier
    const compare = (a, b) => {
      if(body(a) < body(b))
          return -1;
       else return 1;
    };
  
    const digitLogs = [];
    const letterLogs = [];
    for (const log of logs) {
      if (isNum(body(log))) digitLogs.push(log);
      else letterLogs.push(log);
    }
    return [...letterLogs.sort(compare), ...digitLogs];
  };
  
  
  //reorderLogFiles(["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]);

reorderLogFiles(["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]);