/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    var conversions = {I: 1, V: 5, X: 10, L: 50, C:100, D: 500, M: 1000};
    
    var answer = conversions[s[0]];
    for(var i = 1; i < s.length; ++i){
        var currentChar = s[i];
        var prevChar = s[i-1];
        answer += conversions[currentChar];
        //cases: current char V, X, L, C, D, M
        if((currentChar == 'V' || currentChar == 'X') && prevChar == 'I'){
            answer -= 2;
        }
        if((currentChar == 'L' || currentChar == 'C') && prevChar == 'X'){
            answer -= 20;
        }
        if((currentChar == 'D' || currentChar == 'M') && prevChar == 'C'){
            answer -= 200;
        }
    }
    return answer;
};