from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time


class Test:

    def _init_(self):
        self.s = Service(r"C:\\Users\\91994\\Desktop\\Training_Contents\\selenium\\chromedriver_win32\\chromedriver.exe")
        browser = webdriver.Chrome(service=self.s)
        url = 'https://www.urbanladder.com/'

        browser.get(url)
        browser.maximize_window()

        browser.find_element(By.XPATH, "//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span").click()
        time.sleep(1)
        browser.find_element(By.LINK_TEXT, "Log In").click()
        time.sleep(5)
        browser.find_element(By.XPATH, "/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input").send_keys(
            "abc1111@gmail.com")
        time.sleep(2)
        browser.find_element(By.XPATH, "/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input"). \
            send_keys("Fk#mM!wGS9jvx4Z")
        browser.find_element(By.ID, "ul_site_login").click()
        print("Login successful")

        browser.find_element(By.XPATH, "/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/span").click()
        time.sleep(2)
        browser.find_element(By.LINK_TEXT, "Fabric Sofas").click();
        print("Navigated to Fabric sofas page");

        browser.find_element(By.XPATH, "//*[@id='filters-form']/div[1]/div/div/ul/li[4]/div[1]/div").click()
        time.sleep(2)
        browser.find_element(By.ID, "filters_brand_name_By_Urban_Ladder").click()
        print("Sorted brand by urban ladder ")
        time.sleep(6)

        browser.find_element(By.XPATH, "//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[3]/div[1]").click()
        time.sleep(2)
        browser.find_element(By.ID, "filters_primary_colors_Greens").click()
        print("Sorted by filters_primary_colors_Greens")
        time.sleep(1)

        browser.close()


ob1 = Test()