var module;
try {
  module = angular.module('bonitasoft.ui.fragments');
} catch (e) {
  module = angular.module('bonitasoft.ui.fragments', []);
  angular.module('bonitasoft.ui').requires.push('bonitasoft.ui.fragments');
}
module.directive('pbFragmentNuevaSolicitudVacacionesFragmento', function() {
  return {
    template: '<div>    <div class="row">\n        <div pb-property-values=\'b59da66c-bf87-4b4e-ab11-1ea2e9dc13a0\'>\n    <div ng-if="!properties.hidden" class="component col-md-12  col-sm-12  col-xs-12  col-lg-12" ng-class="properties.cssClasses">\n        <pb-date-picker></pb-date-picker>\n    </div>\n</div>\n    </div>\n    <div class="row">\n        <div pb-property-values=\'9606a5a9-03a9-4da1-af19-3c1bd616c8e4\'>\n    <div ng-if="!properties.hidden" class="component col-md-12  col-sm-12  col-xs-12  col-lg-12" ng-class="properties.cssClasses">\n        <pb-input></pb-input>\n    </div>\n</div>\n    </div>\n</div>'
  };
});
