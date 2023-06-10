/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
// use settimeout and cleartime out to set the timeout according to our need
var debounce = function(fn, t) {
    let timeout;
    return function(...args) {
        clearTimeout(timeout);
        timeout=setTimeout(()=>{
         fn(...args);   
        },t);
    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */