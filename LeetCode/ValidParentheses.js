/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var stack = [];
    
    for(var i = 0; i < s.length; i++){
        
        if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
            stack.push(s.charAt(i));
            continue;
        }
        if(stack.isEmpty){
            return false;

        }
        
        if(!compatible(stack.pop(), s.charAt(i)))
            return false;        
    }
    
    if(stack.length == 0)
        return true;
    return false;
    
};

function compatible(left, right){
    if(left == '('){
        console.log(right == ')');
        return right == ')';
        
    }
    if(left == '[')
        return right == ']';
    return right == '}';
};  