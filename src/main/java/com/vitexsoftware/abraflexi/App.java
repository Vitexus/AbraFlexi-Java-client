package com.vitexsoftware.abraflexi;

import com.adleritech.flexibee.core.api.FlexibeeClient;
import com.adleritech.flexibee.core.api.domain.AddressBook;
import com.adleritech.flexibee.core.api.domain.WinstromRequest;
import com.adleritech.flexibee.core.api.domain.WinstromResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * Alderitech AbraFlexi java client usage example
 *
 * @see https://github.com/adleritech/flexibee
 * 
 * @author     Vítězslav Dvořák <info@vitexsoftware.cz>
 * @copyright  (C) 2020 Vitex Software
 */
public class App {

    /**
     * Try to create epty code:TEST in AbraFlexi's Addressbook 
     * 
     * @param args
     * @throws IOException
     * @throws com.adleritech.flexibee.core.api.FlexibeeClient.FlexibeeException 
     */
    public static void main(String[] args) throws IOException, FlexibeeClient.FlexibeeException {

        WinstromRequest request = WinstromRequest.builder().addressBook(AddressBook.builder().code("TEST").name("TEST").build()).build();

        FlexibeeClient flexibeeClient = new FlexibeeClient("winstrom", "winstrom", "demo");

        try {
            WinstromResponse response = flexibeeClient.createAddressBook(request);
            System.out.println(response.toString());
        } catch (FlexibeeClient.FlexibeeException e) {
            System.out.println(e.toString());
        }
    }
}
