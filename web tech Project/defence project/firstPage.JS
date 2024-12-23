document.addEventListener('DOMContentLoaded', function() {
    const searchIcon = document.querySelector('.fa-magnifying-glass');
    const searchForm = document.querySelector('.search-form');
    const searchBox = document.getElementById('search-box');
    const searchLabel = document.querySelector('.search-form label');

    // Add search highlight styles dynamically
    const style = document.createElement('style');
    style.textContent = `
        .search-highlight {
            background-color: rgba(255, 235, 59, 0.4);
            border-radius: 3px;
            transition: background-color 0.3s ease;
        }
    `;
    document.head.appendChild(style);

    // Toggle search form
    searchIcon.addEventListener('click', () => {
        searchForm.classList.toggle('active');
        searchBox.focus();
    });

    // Hide search form when clicking outside
    document.addEventListener('click', (e) => {
        if (!searchForm.contains(e.target) && !searchIcon.contains(e.target)) {
            searchForm.classList.remove('active');
        }
    });

    // Search functionality
    function performSearch() {
        const searchTerm = searchBox.value.toLowerCase().trim();
        if (searchTerm === '') return;

        // Get all searchable content
        const searchableElements = document.querySelectorAll('h1, h2, h3, h4, h5, h6, p, .card-title, .card-text');
        let foundMatch = false;

        // Remove previous highlights
        document.querySelectorAll('.search-highlight').forEach(el => {
            el.classList.remove('search-highlight');
        });

        // Search through elements
        searchableElements.forEach(element => {
            const content = element.textContent.toLowerCase();
            if (content.includes(searchTerm)) {
                element.classList.add('search-highlight');
                if (!foundMatch) {
                    // Scroll to first match with smooth behavior
                    element.scrollIntoView({
                        behavior: 'smooth',
                        block: 'center'
                    });
                    foundMatch = true;
                }
            }
        });

        // Visual feedback if no matches found
        if (!foundMatch) {
            searchBox.classList.add('no-results');
            setTimeout(() => {
                searchBox.classList.remove('no-results');
            }, 500);
        }
    }

    // Search when enter key is pressed
    searchBox.addEventListener('keypress', function(e) {
        if (e.key === 'Enter') {
            e.preventDefault();
            performSearch();
        }
    });

    // Search when search icon is clicked
    searchLabel.addEventListener('click', (e) => {
        e.preventDefault();
        performSearch();
    });

    // Clear highlights when search box is cleared
    searchBox.addEventListener('input', function() {
        if (this.value === '') {
            document.querySelectorAll('.search-highlight').forEach(el => {
                el.classList.remove('search-highlight');
            });
        }
    });
    

});

 // Function to animate counting
 function animateCount(element, targetValue, duration) {
    let startValue = 0;
    let startTime = null;

    function updateCount(timestamp) {
        if (!startTime) startTime = timestamp;
        const progressTime = timestamp - startTime;
        const progressValue = Math.min(startValue + Math.ceil((targetValue / duration) * progressTime), targetValue);
        element.textContent = progressValue.toLocaleString(); // Format the number with commas

        if (progressValue < targetValue) {
            requestAnimationFrame(updateCount);
        }
    }

    requestAnimationFrame(updateCount);
}

// Start the animations when the DOM is fully loaded
document.addEventListener('DOMContentLoaded', function() {
    const activePersonnelValue = document.querySelector('#personnel + .progress .progress-value');
    const reservePersonnelValue = document.querySelector('.progress.yellow .progress-value');

    animateCount(activePersonnelValue, 1237117, 3000); // 3 seconds for active personnel
    animateCount(reservePersonnelValue, 960000, 3000); // 3 seconds for reserve personnel
});
