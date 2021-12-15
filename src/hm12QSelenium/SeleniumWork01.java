package hm12QSelenium;

public class SeleniumWork01 {
/*Different ways to create dynamic Xpath:
 * 1. Tag with a single attribute. (mostly used)
 * united healthcare:
 * //a[@class='org-logo position-relative ml-2   flex justify-center']
 * //input[@id='search-desktop']
 * //input[@id='search__button-desktop'] ??
 * 2. Multiple attribute with 'or' logic
 * //input[@id='search-desktop' or class='serch- input borderRadius - 35 m-0 py-2 px-3weight-medium desktop error']
 * 3. Multiple attribute with 'and' logic
 * //input[@class='search-input borderRadius-35 m-0 py-2 px-3 weight-medium desktop' and @id='serch-desktop']
 * 4. Tag with inner text (Complete text)
 * //a[text()='Find a doctor']
 * //a[text()='Find your plan']
 * 5. Tag with inner text (partial and actual text)
 * //h1[cont]ains(text(), 'Find health insurance plans for individuals and families') (complete)
 * //h1[cont]ains(text(), 'explore')] (partial)
 * 6. 6) Tag with attributes and use of contains (not commonly used)
 * Amazon
 * //h2[contains(@class, 'a-color-base headline truncate-1line gwm-u-blackjack-typography')]
 * 7. Normalize space -- eliminates leading and trailing spaces. (high level)
 * UnitedHealthcare
 * //a[normalize-space(text())='Find a doctor']
 *  8. Starts with text
 *  //p[starts-with(text(), 'Medicare')]
 * 9. Starts with attribute (not commonly used, no need to practice it)
 * //h1[starts-with(@class, 'text-align-left  title-spacing title__heading')]
 * 
 * 
 * 
 * */

}
