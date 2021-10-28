describe('Angular forms test', function () {

	var male = element(by.model('Male'));
	var female = element(by.model('Female'));
	var terms = element(by.model('terms'));
	var subjects = element(by.model('subjects'));
	var reset = element(by.model('reset'));
	var fname = element(by.model('firstname'));
	var lname = element(by.model('lastname'));
	var others = element(by.model('others'));
	var em = element(by.model('email'));
	var s = element(by.model('save'));
	var heading=element(by.model('headi'));
	beforeEach(function () {
		browser.get('http://localhost/Activity/Angular1.7.html');
	});

	it('Title test', function () {
		expect(browser.getTitle()).toEqual('Angular JS Forms');
	});
	it('Testing Heading', function () {
		
		expect(heading.getText()).toEqual('AngularJS Sample Application');
	})

	it('Gender:Male Test', function () {
		male.click();
		expect(male.isSelected()).toBe(true);
	});
	it('Gender:Female Test', function () {
		female.click();
		expect(female.isSelected()).toBe(true);
	});
	it('Gender:Others Test', function () {
		others.click();
		expect(others.isSelected()).toBe(true);
	});
	it('Terms and conditions checkbox test', function () {

		expect(terms.isSelected()).toBe(false);
		terms.click();
		expect(terms.isSelected()).toBe(true);
	});

	it('Subjects dropdown test', function () {
		subjects.$('[value="AngularJs"]').click();
		expect(subjects.$('[value="AngularJs"]').isSelected()).toBe(true);
		subjects.$('[value="NodeJs"]').click();
		expect(subjects.$('[value="NodeJs"]').isSelected()).toBe(true);
		subjects.$('[value="React Js"]').click();
		expect(subjects.$('[value="React Js"]').isSelected()).toBe(true);
		subjects.$('[value="others"]').click();
		expect(subjects.$('[value="others"]').isSelected()).toBe(true);


	});
	it('Reset is Working or Not', function () {
		fname.sendKeys('Arun');
		lname.sendKeys('Raghav');
		reset.click();
		expect((s).isEnabled()).toBe(false)
	})
	it(' checking the tagName',function () {
		expect((fname).getTagName()).toEqual('input');
		
	})
	
	it(' checking the  tag name',function () {
		expect((terms).getAttribute("value")).toEqual('accept');
		
	})
})