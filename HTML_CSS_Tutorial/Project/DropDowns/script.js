const handleDropdownClicked = (event) => {
    event.stopPropagation();

    const dropdown = document.getElementById("dropdown");

    toggleDropdown(
        !dropdown.classList.contains("open")
    );
};