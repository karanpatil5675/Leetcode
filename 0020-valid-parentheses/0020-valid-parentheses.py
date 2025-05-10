class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        parentheses_map = {')': '(', '}': '{', ']': '['}
        
        for char in s:
            if char in parentheses_map:
                top_element = stack.pop() if stack else '#'
                if parentheses_map[char] != top_element:
                    return False
            else:
                stack.append(char)
        
        return not stack