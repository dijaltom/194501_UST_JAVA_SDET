
describe('Protractor Demo', () => {
	it('Should navigate to Demo Page', () => {
		browser.get(require('../Angulartestact.html'));
		browser.getCurrentUrl().then((url) => {
			expect(url).toBe(require('../Angulartestact.html'));
		});
	});
});
