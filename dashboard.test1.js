/**
 * Created by swetha on 9/2/17.
 */

//import 'mocha-sinon';
//import {expect} from 'chai';
//import * as React from 'react';
//import * as Actions from '../../src/actions/dashboardActions';
const mocha = require('mocha-sinon');
const react  = require('react');
const expect  =  require('chai').expect;
const Actions = require('../../src/actions/dashboardActions');

describe('file',function () {
    it('should work',function () {
        expect(true).to.be.true;
        expect(Array.isArray(arr));
        expect(Actions.getTimeSpentOnCategory().type.equals("GET_TIME_SPENT_ON_CATEGORY"));
       /*
        function isArray(array) {
            return array.every(function (item) {
                return typeof item === 'string';
            });
        }
*/
        function arr() {
            return 'string'
        }
    });
});
