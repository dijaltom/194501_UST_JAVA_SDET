from selenium import webdriver
import time

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common import actions
from selenium.webdriver.common.by import By

s = Service("D:\\font style\\chromedriver_win32_2\\chromedriver.exe")
driver = webdriver.Chrome(service=s)
driver.get("https://www.urbanladder.com/tv-units?src=g_topnav_storage_living-storage_tv-units")
driver.maximize_window()

print(driver.title)

# closing popup
driver.implicitly_wait(13)
driver.find_element(By.LINK_TEXT, "Close").click()
print("Closed pop-up")
driver.implicitly_wait(5)

# checking checkbox
checkbox = driver.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[2]/div/label").click()
driver.implicitly_wait(13)
print(driver.find_element(By.ID, "filters_availability_In_Stock_Only").is_selected())
time.sleep(2)

# checking radio button
radio = driver.find_elements(By.NAME, "price_limit")
act = ActionChains(driver)
for i in radio:
    act.move_to_element(driver.find_element(By.XPATH, "//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]/div[1]")).perform()
    print("Cursor hovered over to price")
    driver.implicitly_wait(10)
    i.click()
    print(i.get_attribute("value")+" clicked")
    time.sleep(2)

# checking dropdown WebElement

act = ActionChains(driver)
dropdown = driver.find_element(By.XPATH, "//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]")
dropdownEl = driver.find_elements(By.XPATH,
                                      "//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li")
for i in dropdownEl:

        act.move_to_element(dropdown).perform()
        print("mouse hovered to  " + dropdown.text)
        i.click()
        print("clicked " + i.text)
time.sleep(5)

# checking searchbox
search = driver.find_element(By.ID, "search").send_keys("Astrid TV Unit")
driver.implicitly_wait(5)
driver.find_element(By.CLASS_NAME, "icofont-cross").click()
driver.find_element(By.ID, "search_button").click()
print("Searched Astrid TV Unit")
time.sleep(2)

driver.close()